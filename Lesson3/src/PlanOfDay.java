
public class PlanOfDay {
	public static void main(String[] args) {
		
		String day ="Sunday";
		System.out.println(day);
		switch (day) {
		case "Monday": {
			System.out.println("Do somthing in Mondey");
			break;
		}
		case "Tuesday": {
			System.out.println("Do somthing in Tuesday");
			break;
		}
		case "Wednesday": {
			System.out.println("Do somthing in Wednesday");
			break;
		}
		case "Thursday": {
			System.out.println("Do somthing in Thursday");
			break;
		}
		case "Friday": {
			System.out.println("Do somthing in Friday");
			break;
		}
		case "Saturday": {
			System.out.println("Do somthing in Sayurday");
			break;
		}
		case "Sunday": {
			System.out.println("Do somthing in Sunday");
			break;
		}
		default:
			System.out.println("Програма виявила помилку: день введено не коректно!");
			break;
		}
		
	}
}
