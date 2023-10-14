import java.util.Scanner;
public class PatientInformation {
    private long patientID;
    private String name;
    private int age;
    private String gender;
    private long contactNumber;
    private String address;

    public PatientInformation(long patientID, String name, int age,String gender, long contactNumber, String address) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contactNumber = contactNumber;
        this.address = address;
    }

    public long getPatientID() {
        return patientID;
    }

    public void setPatientID(long patientID) {
        this.patientID = patientID;
    }

    public String getName() {

        return name;
    }
    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {

        return gender;
    }
    public void setGender(String gender) {

        this.gender = gender;
    }

    public long getContactNumber() {

        return contactNumber;
    }
    public void setContactNumber(long contactNumber) {

        this.contactNumber = contactNumber;
    }

    public String getAddress() {
        return address;

    }
    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter patient ID: ");
        long patientID = scanner.nextLong();

        System.out.print("Enter name: ");
        String name = scanner.next();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter gender: ");
        String gender = scanner.next();

        System.out.print("Enter contact number: ");
        long contactNumber = scanner.nextLong();

        System.out.print("Enter address: ");
        String address = scanner.next();

        PatientInformation patient = new PatientInformation(patientID, name, age, gender, contactNumber, address);

        System.out.println("Patient ID: " + patient.getPatientID());
        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());
        System.out.println("Gender: " + patient.getGender());
        System.out.println("Contact Number: " + patient.getContactNumber());
        System.out.println("Address: " + patient.getAddress());
        System.out.println("Thank you for providing your information. Your details have been successfully recorded in our system.");

        scanner.close();
    }
}
