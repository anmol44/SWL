package commons;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Powershell {

 public  void script() throws IOException {

  //String command = "powershell.exe  your command";
  //Getting the version
  String command = "powershell.exe  set-itemproperty  -path \"HKLM:\\SOFTWARE\\Policies\\Microsoft\\Edge\" -name \"BrowserSignin\" -value \"1\" ";
  // Executing the command
  Process powerShellProcess = Runtime.getRuntime().exec(command);
  // Getting the results
  powerShellProcess.getOutputStream().close();
  String line;
  System.out.println("Standard Output:");
  BufferedReader stdout = new BufferedReader(new InputStreamReader(
    powerShellProcess.getInputStream()));
  while ((line = stdout.readLine()) != null) {
   System.out.println(line);
  }
  stdout.close();
  System.out.println("Standard Error:");
  BufferedReader stderr = new BufferedReader(new InputStreamReader(
    powerShellProcess.getErrorStream()));
  while ((line = stderr.readLine()) != null) {
   System.out.println(line);
  }
  stderr.close();
  System.out.println("Done");

 }

}