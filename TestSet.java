

public class TestSet {
    
    public static class Set {

        private int size = 0;
        private String [] array = new String [10];

        private boolean add(String value) {

            if (contains(value)) {
                return false;
            }
            else {
                
                array[size]= value;
                size++;
                return true;
            }
        }

        private boolean contains(String value) {
            for(String data : array) {
                if (value.equals(data)) {
                    return true;
                }
            }

            return false;
        }

    }
}

