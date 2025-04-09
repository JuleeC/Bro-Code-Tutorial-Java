#include <stdio.h>
#include "freertos/FreeRTOS.h"
#include "freertos/task.h"
#include "driver/gpio.h"
#include "esp_log.h"
#include "sdkconfig.h"                                  //Libraries
#include "driver/adc.h"
#include "esp_adc_cal.h"
 
double spg_value = 0;                                   //spg_value den Wert 0 zuweisen (mit Datentyp double)
 
static esp_adc_cal_characteristics_t adc1_chars;        //ADC Variable
 
 
void app_main(void)                                     //Methode
{
    esp_adc_cal_characterize(ADC_UNIT_1, ADC_ATTEN_DB_11, ADC_WIDTH_BIT_DEFAULT, 0, &adc1_chars);       //Charakterisierung von ADC
 
    adc1_config_width(ADC_WIDTH_BIT_DEFAULT);                       //Konfiguration der Bandbreite
    adc1_config_channel_atten(ADC1_CHANNEL_4, ADC_ATTEN_DB_11);     //Pin vom ADC
 
    while (1)                                           //Endlosschleife
    {
        int adc_value = adc1_get_raw(ADC1_CHANNEL_4);   //adc_value nimmt den ADC Wert an
        spg_value = (double) (adc_value) / 4095 * 3.3;  //Umrechnung von ADC Wert in die Spannung mit Formel
        printf("ADC Value: %d", adc_value);             //Ausgabe von ADC Value
        printf("\n");                                   //Zeilenumbruch
 
        printf("Spannungsvalue: %f", spg_value);        //Ausgabe von spg_value
        printf("\n");                                   //Zeilenumbruch
        vTaskDelay(500/ portTICK_PERIOD_MS);            //Verzögerung
    }
}