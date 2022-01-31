package VirtualKeyForRepositories;
public class RepositoriesMain {

	public static void main(String[] args) {
FileOperations.createMainFolderIfNotPresent("main");
		
DisplayOptions.printWelcomeScreen("RepositoriesKey","Sai Prasad");
		
HandleUserOptions.handleWelcomeScreenInput();
	}

}
