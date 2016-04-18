public class PhoneLauncher {
	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	public void launch() {
		OldPhone testPhone = new OldPhone();
		testPhone.call("999");
		
		MobilePhone testMobile = new MobilePhone();
		testMobile.ringAlarm("Wake Up!");
		testMobile.playGame("* * * * GAME * * * *");
		
		testMobile.call("000");
		testMobile.call("111");
		testMobile.call("222");
		testMobile.call("333");
		testMobile.call("444");
		testMobile.call("555");
		testMobile.call("666");
		testMobile.call("777");
		testMobile.call("888");
		testMobile.call("999");
		
		testMobile.printLastNumbers();
		
		
		SmartPhone newSmart = new SmartPhone();
		newSmart.browseWeb(" <web search> ");
		newSmart.findPosition(" <position> ");
		newSmart.playGame("Smart Game");
		newSmart.ringAlarm("Smart Alarm");
		newSmart.call("321");
		newSmart.call("111");
		newSmart.call("222");
		newSmart.call("333");
		newSmart.call("444");
		newSmart.call("555");
		newSmart.call("666");
		newSmart.call("777");
		newSmart.call("888");
		newSmart.call("999");
		newSmart.call("232");
		newSmart.call("758");
		newSmart.call("147");
		
		newSmart.printLastNumbers();
	}
}