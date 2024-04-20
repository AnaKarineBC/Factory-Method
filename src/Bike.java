public class Bike implements IFactory
{
    public void Drive(int miles)
    {
       System.out.print("Drive the Bike : "+miles+" km");
    }
}