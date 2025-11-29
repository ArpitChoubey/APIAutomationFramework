package PoJoExamples;

public class CreateBookingTest {

	public static void main(String[] args) {


		//for(int i=0; i<5;i++) {
		//	if(CreateBookingRetryMechanism.createbooking()==200)
		//	break;
		}
	Awaitility
    .await()
    .atMost(Duration.ofSeconds(30))
    .pollInterval(Duration.ofSeconds(2))
    .until(() -> CreateBookingRetryMechanism.createBooking() == 200);
	
	}

}
