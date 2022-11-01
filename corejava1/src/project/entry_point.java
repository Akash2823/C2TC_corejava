package project;

public class entry_point {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mmfactory bankfactory=new mmfactory();
		 mmbanksavingsaccount SavingAcc=new  mmbanksavingsaccount(0, null, 0, false);
		 mmbankcurrentaccount CurrentAcc=new  mmbankcurrentaccount(0, null, 0, 0);
		 SavingAcc.withdraw();
		 SavingAcc.toString();
		 CurrentAcc.withdraw();
		 CurrentAcc.toString();
	}

}
	}

}
