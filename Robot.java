
/**
 * Write a description of class MyApp here.
 *
 * @author (2017315002 김아름, 2018315022 이지연)
 * @version (2020.04.09)
 */
public class Robot
{
    public static double RobotWalk(String signal, double speed)
    {
        if (signal == "녹색");
        else if(signal == "노란색")
            speed = speed * 1.2;
        else
            speed = 0;
        return speed;
    }
}