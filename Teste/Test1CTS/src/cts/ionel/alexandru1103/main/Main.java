package cts.ionel.alexandru1103.main;

import cts.ionel.alexandru1103.builder.*;
import cts.ionel.alexandru1103.singleton.*;

public class Main {

	public static void main(String[] args) {
		
		//tester for Builder
		IGamingSystemBuilder systemBuilder = new GamingSystemAdvancedBuilder();
		GamingSystemEngineer systemEngineer = new GamingSystemEngineer(systemBuilder);
		systemEngineer.buildGamingSystemSetup();
		IGamingSystem gamingSystem =  systemEngineer.getSystem();
		gamingSystem.printConfiguration();
		
		//tester for Singleton
		ITestingModule module = TestingModule.getInstance("Windows version needs update!", "The instalation failed because of multiple missing DDLs");
		System.out.println( module.test());
		
		//the result of the displaying function will be the same as the first because moduleForTestingSingleton will not be initialized 
		//( the instance variable is already populated)
		ITestingModule moduleForTestingSingleton = TestingModule.getInstance("ZAZAZZAZAZA", "XAXAXAXAXAXA");
		System.out.println( module.test());
		

	}

}
