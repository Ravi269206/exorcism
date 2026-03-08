import java.util.Map;
import java.util.HashMap;

public class DialingCodes {

    Map<Integer,String> dialingCodes = new HashMap<Integer,String>();

    public Map<Integer, String> getCodes() {
        return dialingCodes;
    }

    public void setDialingCode(Integer code, String country) {
        dialingCodes.put(code,country);
    }

    public String getCountry(Integer code) {
        return dialingCodes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        
        if(!dialingCodes.containsKey(code) && !dialingCodes.containsValue(country)){
           setDialingCode(code,country);
        }
    }

    public Integer findDialingCode(String country) {
        Integer countryCode = null;
        for(Map.Entry<Integer, String> entry : dialingCodes.entrySet()){
            if(entry.getValue().equals(country)){
                countryCode = entry.getKey();
                break;
            }
        }
        return countryCode;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        if(dialingCodes.containsValue(country)){
            for(Map.Entry<Integer, String> entry : dialingCodes.entrySet()){
            if(entry.getValue().equals(country)){
                dialingCodes.remove(entry.getKey());
                dialingCodes.put(code,country);
                break;
            }
        }
        }
    }
}
