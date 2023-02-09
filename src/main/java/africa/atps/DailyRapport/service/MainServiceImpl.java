package africa.atps.DailyRapport.service;

import africa.atps.DailyRapport.domain.Campagne;
import africa.atps.DailyRapport.repository.CampagneRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.json.JSONObject;

import java.util.*;
import java.util.stream.Stream;

@Service
public class MainServiceImpl {
    @Autowired
    CampagneRepository campagneRepository;
    ObjectMapper objectMapper;

    public Map<Integer,List<String>> treatDataFromDB() throws JsonProcessingException, JSONException {
        Map<Integer,List<String>> data = new HashMap<>();
        List<Campagne> lsCampagne =  campagneRepository.findLastFiveCampagne();
        if(!lsCampagne.isEmpty()){
            int index = 1;
            for (Campagne  camp :lsCampagne){
                JSONObject jsonObject = new JSONObject(camp.toString());
                List<String> f_data = new ArrayList<>();

                Iterator<String> keys = jsonObject.keys();
                while(keys.hasNext()) {
                    String key = keys.next();
                    if (jsonObject.get(key) instanceof JSONObject) {
                        f_data.add((String) jsonObject.get(key));
                    }
                }

                data.put(index,f_data);
                index++;
            }
        }
        return data;
    }
}
