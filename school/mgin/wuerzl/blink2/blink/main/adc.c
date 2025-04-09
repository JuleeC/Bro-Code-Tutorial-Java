
#include <stdio.h>
#include "freertos/FreeRTOS.h"
#include "freertos/task.h"
#include "driver/gpio.h"
#include "esp_log.h"
#include "sdkconfig.h"

#include "driver/adc.h"
#include "esp_adc_cal.h"

double spg_value = 0;

static esp_adc_cal_characteristics_t adc1_chars;

//main Methode
void app_main(void)
{
    esp_adc_cal_characterize(ADC_UNIT_1, ADC_ATTEN_DB_11, ADC_WIDTH_BIT_DEFAULT, 0, &adc1_chars);

    adc1_config_width(ADC_WIDTH_BIT_DEFAULT);
    adc1_config_channel_atten(ADC1_CHANNEL_4, ADC_ATTEN_DB_11);

    while (1) 
    {
        int adc_value = adc1_get_raw(ADC1_CHANNEL_4);
        spg_value = (double)(adc_value/4095)*3.3;
        printf("SPG Value: %f", spg_value);
        printf("ADC Value: %d", adc_value);
        printf("\n");
        vTaskDelay(500/ portTICK_PERIOD_MS);
    }
}
