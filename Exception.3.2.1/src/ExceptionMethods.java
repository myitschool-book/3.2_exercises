
public class ExceptionMethods {
	 public static void main(String[] args) {
	        try {
	            throw new Exception("Пробное исключение");
	        } catch(Exception e) {
	             System.err.println("Обрабатываем исключение");
	             System.err.println("e.getMessage(): " + e.getMessage());
	             System.err.println("e.getLocalizedMessage(): " +e.getLocalizedMessage());
	             System.err.println("e.toString(): " + e);
	             System.err.println("e.printStackTrace():");
	             e.printStackTrace(System.err);
	        }
	    }
}
