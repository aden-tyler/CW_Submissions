
public class testCorrections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		findIfIsLeapYear();
	
	}

	public static boolean findIfIsLeapYear(int year)
	{
		if (year % 100 == 0)
		{
			if (year % 400 == 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}

		else if (year % 4 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
