package edu.cnm.deepdive.temperature_conversion.convserion;

public class Conversion {

    private static final double CELSIUS_TO_FAHRENHEIT_SCALE = 9.0 / 5;
    private static final double FAHRENHEIT_TO_CELSIUS_SCALE = 1 / CELSIUS_TO_FAHRENHEIT_SCALE;
    private static final double KELVIN_OFFSET = 273;
    private static final double SCALE_OFFSET = 32;

    public static double convertC2F(double celsius) {
      return celsius * CELSIUS_TO_FAHRENHEIT_SCALE + SCALE_OFFSET;
    }

    public static double convertF2C(double fahrenheit) {
      return (fahrenheit - SCALE_OFFSET) * FAHRENHEIT_TO_CELSIUS_SCALE;
    }

    public static double convertK2C(double kelvin) {
      return (kelvin - KELVIN_OFFSET);
    }

    public static double convertC2K(double celsius) {
      return celsius + KELVIN_OFFSET;
    }

    public static double convertF2K(double fahrenheit) {
      return convertF2C(fahrenheit - SCALE_OFFSET) * FAHRENHEIT_TO_CELSIUS_SCALE+ KELVIN_OFFSET;
    }

    public static double convertK2F(double kelvin) {
      return (kelvin - KELVIN_OFFSET) * CELSIUS_TO_FAHRENHEIT_SCALE + SCALE_OFFSET;
    }
}
