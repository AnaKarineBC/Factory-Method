public class Scooter implements IFactory
    {
        public void Drive(int miles)
        {
            System.out.print("Drive the Scooter : "+miles+" km");
        }
    }