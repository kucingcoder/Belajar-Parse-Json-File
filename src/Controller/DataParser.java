package Controller;
import Model.Clubs;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.JSONArray;
import org.json.JSONObject;
public class DataParser {
    public static ArrayList<Clubs> Jukutna(String alamatfile){
        ArrayList<Clubs> hasil = new ArrayList<Clubs>();

        try {
            JSONObject mentahan = new JSONObject(new String(Files.readAllBytes(Paths.get(alamatfile))));
            JSONArray daftar_clubs = mentahan.getJSONArray("clubs");

            for (int i = 0; i < daftar_clubs.length(); i++) {
                Clubs objeksementara = new Clubs();
                JSONObject clubs = daftar_clubs.getJSONObject(i);
                objeksementara.setName(clubs.getString("name"));
                objeksementara.setCode(clubs.optString("code"));
                objeksementara.setCountry(clubs.getString("country"));
                hasil.add(objeksementara);
            }
        } catch (Exception e) {
            e.getMessage();
        }

        return hasil;
    }
}