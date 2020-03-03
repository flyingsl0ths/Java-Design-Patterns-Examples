import java.util.Hashtable;

public class StyleChange {
	
    private static Hashtable<String, Style> styleMap  = new Hashtable<String, Style>();
 
    public static final void loadStyles() {
      Trickster trckstr = new Trickster();
      trckstr.setId("1");
      styleMap.put(trckstr.getId(), trckstr);

      SwordMaster swrdMstr = new SwordMaster();
      swrdMstr.setId("2");
      styleMap.put(swrdMstr.getId(), swrdMstr);

      Quicksilver qckSlvr = new Quicksilver();
      qckSlvr.setId("3");
      styleMap.put(qckSlvr.getId(),qckSlvr);
   }

    public static Style changeStyle(String styleId) {
       Style styleList = styleMap.get(styleId);
       return (Style) styleList.change();
    }
 }