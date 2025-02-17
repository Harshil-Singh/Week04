package reflections.advancedlevel;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import reflections.advancedlevel.jsonrepresentation.JsonSerializer;
import reflections.advancedlevel.jsonrepresentation.Person;

class JsonSerializerTest {

    @Test
    void testToJson() {
        Person person = new Person("Harshil", 22, false);
        String expectedJson = "{\"name\": \"Harshil\", \"age\": 22, \"isEmployed\": false}";

        assertEquals(expectedJson, JsonSerializer.toJson(person));
    }
}
