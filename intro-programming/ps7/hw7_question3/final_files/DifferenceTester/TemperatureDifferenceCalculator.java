//This problem will use the same data as the previous one. This time you are
//to complete the TemperatureDifferenceCalculator. It has two methods:
//
//public double maxDifference() - Calculates the maximum difference between
//any two consecutive day. If Jan 7 temperature is 5 degrees and
//Jan 8 is -10 degrees, the difference in the two temperatures is 15.
//The temperature changed 15 degrees between on day and the next. The difference
// is always the absolute value..
//
//public double minDifference() - Calculates the maximum difference between
//any two consecutive day
//
//For the draft, provide the method stubs (in this case the headers and
//a return value of 0)

public class TemperatureDifferenceCalculator
{
    private double[] data;
    //final double EPSILON = 1E - 12;

    /**
     * Constructs a TemperatureDifferenceCalculator with the given array
     * @param the array to process
     */
    public TemperatureDifferenceCalculator(double[] list)
    {
        data = list;
    }

    /**
     * Gets the maximum difference between any two consecutive values
     * @return the maximum difference
     */
    public double maxDifference()
    {
      double maxDiff = Double.MIN_VALUE;
      double diff = 0.;
      for (int i = 0; i < data.length-1; i++)
      {
          diff = Math.abs(data[i] - data[i+1]);
          if (diff > maxDiff)
          {
              maxDiff = diff;
          }
      }

      return maxDiff;
    }
    /**
     * Gets the minimum difference between any two consecutive values
     * @return the minimum difference
     */
    public double minDifference()
    {
        double minDiff = Double.MAX_VALUE;
        double diff = 0.;
        for (int i = 0; i < data.length-1; i++)
        {
            diff = Math.abs(data[i] - data[i+1]);
            if (diff < minDiff)
            {
                minDiff = diff;
            }
        }
        return minDiff;
    }

}
