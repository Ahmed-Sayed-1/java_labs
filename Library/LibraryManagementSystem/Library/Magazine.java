public class Magazine extends LibraryItem{
      // Daily-Weekly - Monthly
    //   private int volume;
    //   private int issue;
     public Magazine(String id,String title){
            this.id=id;
            this.title=title;
            // this.volume=volume;
            // this.issue=issue;
      }
          public String getItemDetails(){
        // System.out.println("Id: \t"+id);
        // System.out.println("title \t"+title);
        // System.out.println("Volume \t"+volume);
        // System.out.println("Issue \t"+issue);
        return ("Id: \t"+id+"title \t"+title);
    }
}