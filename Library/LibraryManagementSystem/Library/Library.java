import java.util.List ;
import java.util.ArrayList; 

public class Library{
    private List<LibraryItem>items=new ArrayList<>();
    private List<Client> client=new ArrayList<>();
    
    public void addItem(LibraryItem item)
    {
        items.add(item);
    }
    public void addClients(Client item)
    {
        client.add(item);
    }
    public LibraryItem getItem(String id) throws ItemNotFoundException
    {
        for(int i=0;i<items.size();i++)
        {
            if(items.get(i).id.equals(id))
            {
                return items.get(i);
            }
        }
        if(true)
        throw new ItemNotFoundException();
        return null;
    }
    public Client getClient(String id) throws ItemNotFoundException
    {
        for(int i=0;i<client.size();i++)
        {
            if(client.get(i).getId().equals(id))
            {
                return client.get(i);
            }
        }
        if(true)
        throw new ItemNotFoundException();
        return null;
    }
    public List<LibraryItem> displayitems() {
        // List<String> details = new ArrayList<>();
        // for (LibraryItem item : items) {
        //     details.add(item.getItemDetails());
        // }
        return items;
    }
    public void displayClients()
    {
        for(int i=0;i<client.size();i++)
        {
            client.get(i).getClientDetails();
        }
    }
    public boolean deleteItem(String id)
    {
        for(int i=0;i<items.size();i++)
        {
            if(items.get(i).id.equals(id))
            {
                items.remove(i);
                return true;
            }
        }
        return false;
    }
    public boolean deleteClient(String id)
    {
        for(int i=0;i<client.size();i++)
        {
            if(client.get(i).getId().equals(id))
            {
                client.remove(i);
                return true;
            }
        }
        return false;
    }
}