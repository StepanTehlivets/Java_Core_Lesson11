package ua.academy.lgs;

public class WrongInputException extends Exception{

		private String itsWrong;

		WrongInputException(String itsWrong) {
			super(itsWrong);
			this.itsWrong = itsWrong;

		}

		public String getItsWrong() {
			return itsWrong;
		}

	}


