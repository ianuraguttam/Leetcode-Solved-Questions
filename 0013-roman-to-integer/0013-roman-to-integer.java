class Solution {
    public int romanToInt(String s) {
        String[] array = s.split("");

        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            if (Objects.equals(array[i], "I")){

                if (i == array.length - 1){
                    
                    sum += 1;
                    
                } else {
                    
                    if (Objects.equals(array[i+1], "V") || Objects.equals(array[i+1], "X")) {
                        
                        sum -= 1;
                        
                    } else {
                        
                        sum += 1;
                    }
                }
            }

            if (Objects.equals(array[i], "V")){
                sum += 5;
            }

            if (Objects.equals(array[i], "X")){

                if (i == array.length - 1){
                    
                    sum += 10;
                    
                } else {
                    
                    if (Objects.equals(array[i+1], "L") || Objects.equals(array[i+1], "C")) {
                        
                        sum -= 10;
                        
                    } else {
                        
                        sum += 10;
                    }
                }
            }

            if (Objects.equals(array[i], "L")){
                sum += 50;
            }

            if (Objects.equals(array[i], "C")){

                if (i == array.length - 1){
                    
                    sum += 100;
                    
                } else {
                    
                    if (Objects.equals(array[i+1], "D") || Objects.equals(array[i+1], "M")) {
                        
                        sum -= 100;
                        
                    } else {
                        
                        sum += 100;
                    }
                }
            }

            if (Objects.equals(array[i], "D")){
                sum += 500;
            }

            if (Objects.equals(array[i], "M")){
                sum += 1000;
            }

        }

        return sum;
    }
}