public abstract class Style implements Cloneable {
   
    private String id;
    protected String styleType;
    
    abstract void changed();
    
    public String getType(){
       return styleType;
    }
    
    public String getId() {
       return id;
    }
    
    public void setId(String id) {
       this.id = id;
    }
    
    public Object change() {
       Object clone = null;
       
       try {
          clone = super.clone();
          
       } catch (CloneNotSupportedException e) {
          e.printStackTrace();
       }
       
       return clone;
    }
 }