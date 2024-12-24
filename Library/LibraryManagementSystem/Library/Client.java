public class Client{
private String id;
private String name;
private String email;
public Client(String id,String name,String email){
    this.id=id;
    this.name=name;
    this.email=email;
}
public String getId() {
    return id;
}

public String getClientDetails(){
    // System.out.println("Id: \t"+id);
    // System.out.println("Name \t"+name);
    // System.out.println("Email \t"+email);
    return ("Id: \t"+id+"Name \t"+name+"Email \t"+email);
}


}