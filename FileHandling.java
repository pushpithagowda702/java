import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

class FileHandling {
  public static void main(String[] args) throws IOException {
    // Input stream reader
    try (InputStreamReader isr = new InputStreamReader(System.in)) {
      System.out.println("Enter data: ");
      int data = isr.read();
      while(isr.ready()) {
        System.out.println((char) data);
        data = isr.read();
      }
      isr.close();
      System.out.println();
    } catch (Exception  e) {
      System.out.println(e.getMessage());
    }
    
    // File reader
    try (FileReader file = new FileReader("Enums.java")) {
      
      int data = file.read();
      while(file.ready()) {
        System.out.print((char) data);
        data = file.read();
      }
      file.close();
      System.out.println();
    } catch (Exception  e) {
      System.out.println(e.getMessage());
    }

    // Buffered Reader
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      System.out.println("Enter number: ");
      int a = br.read();
      System.out.println(a);
      br.close();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

    // Output stream writer

    try(OutputStreamWriter os = new OutputStreamWriter(System.out)) {
      os.write("dj");
      os.write(98);
      os.write(201);
      os.write("\n");
      os.close();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    // File Writer 
    FileWriter f = new FileWriter("notes.txt");
    f.write("Hello world");
    FileWriter f2 = new FileWriter("notes.txt", true);
    f2.write(" text appended");
    f.close();
    f2.close();

    // Buffered Writer
    BufferedWriter bw = new BufferedWriter(new FileWriter("notes.txt"));
    bw.write("Hi from buffered writer");
    bw.close();

    FileWriter fw = new FileWriter("file1.txt");
    fw.write("न त्वेवाहं जातु नासं न त्वं नेमे जनाधिपा | न चैव न भविष्याम: सर्वे वयमत: परम्");
    fw.close();

    BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
    while(br.ready()) {
      System.out.print(br.readLine());
    }
    System.out.println();
    br.close();

    // create and delete a file

    File fo = new File("Delete.txt");
    fo.createNewFile();
    System.out.println(fo.getName() + " created");
    if(fo.delete()) {
      System.out.println(fo.getName() + " deleted");
    }
  }
}