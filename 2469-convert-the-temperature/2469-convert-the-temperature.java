class Solution {
    public double[] convertTemperature(double celsius) {
        double[] results = new double[2];
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;
        results[0] = kelvin;
        results[1] = fahrenheit;
        return results;
    }
}