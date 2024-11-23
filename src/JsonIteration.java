
public class JsonIteration {
	public static void main(String[] args) {
        String jsonString = "{\"name\": \"John\", \"age\": 30, \"city\": \"New York\"}";

        // Parse the JSON string into a JSON object
        JSONObject jsonObject = new JSONObject(jsonString);

        // Iterate over the properties using a for loop
        for (String key : jsonObject.keySet()) {
            Object value = jsonObject.get(key);
            System.out.println(key + ": " + value);
        }
    }

}
