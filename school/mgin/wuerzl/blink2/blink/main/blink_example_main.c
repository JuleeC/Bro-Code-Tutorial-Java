/* Blink Example

   This example code is in the Public Domain (or CC0 licensed, at your option.)

   Unless required by applicable law or agreed to in writing, this
   software is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
   CONDITIONS OF ANY KIND, either express or implied.
*/

//die ganzen Libarys werden importiert
//viele wichtige Methoden die benötigt werden
#include <stdio.h>
//ist der Kernel der für Microprozessoren geschaffen wurde
#include "freertos/FreeRTOS.h"
//schaut welche Tasks gemacht werden müssen
#include "freertos/task.h"
//Der Treiber um es mit dem Gerät kompatibel zu machen
#include "driver/gpio.h"
//wird für permanente Logging Funktionalitäten benutzt

#include "esp_log.h"
//eine Textdatei die Kconfig items als key, value pairs speichert.
#include "sdkconfig.h"

//static const char *TAG = "example";

/* Use project configuration menu (idf.py menuconfig) to choose the GPIO to blink,
   or you can edit the following line and set a number here.
*/
//es wird eine Variable definiert für den Pin an dem die LED steckt
#define BLINK_GPIO 2
#define TASTER 13

//der jetzige Status den die LED hat
static uint8_t s_led_state = 0;


//die Function die gecalled wird wenn die LED leuchten soll
static void blink_led(void)
{
    /* Set the GPIO level according to the state (LOW or HIGH)*/
    //setzt die LED entweder auf HIGH oder LOW.
    gpio_set_level(BLINK_GPIO, s_led_state);
}


static void configure_led(void)
{
    //zeigt an dass die LED konfiguriert wird um es zum Blinken zum bringen.
    printf("Example configured to blink GPIO LED! \n");
    
    //setzt den pin zurück auf dem die LED angesteckt wird, um Störungen zu vermeiden.
    gpio_reset_pin(BLINK_GPIO);
    gpio_reset_pin(TASTER);
    /* Set the GPIO as a push/pull output */
    // setzt den pin als Output fest und nicht als INPUT-
    gpio_set_direction(BLINK_GPIO, GPIO_MODE_OUTPUT);
    gpio_set_direction(TASTER,GPIO_MODE_INPUT);
}


//main Methode
void app_main(void)
{

    /* Configure the peripheral according to the LED type */
    configure_led();
    //endlos schleife die da ist um den Zustand zu wechseln
    while (1) {
        //falls der LED Zustand gleich true ist, soll "ON" ausgegeben werden, sonst soll "OFF" ausgegeben werden
        printf( "Turning the LED %s! \n", s_led_state == true ? "ON" : "OFF");
        
        if(gpio_get_level(TASTER) == 1 ) {
            s_led_state = 0;
        } else {
            s_led_state = 1;
        }
        // die Methode wird gecalled die den Zustand der LED setzen soll
        blink_led();
       
        //es verzögert das Programm um 1000ms. Der Parameter ist 1000ms deshalb macht er ein Delay für 1000ms
        vTaskDelay(CONFIG_BLINK_PERIOD / portTICK_PERIOD_MS);
    }
}
