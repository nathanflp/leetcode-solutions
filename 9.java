class PalindromeNumber {
    public boolean isPalindrome(int x) {

        String valueObject = String.valueOf(x);
        int ObjectLength = valueObject.toCharArray().length;
        char[] invertedObject = new char[ObjectLength];
        int j = ObjectLength -1;

        for(int i = 0; i < invertedObject.length; i++){
            invertedObject[i] = valueObject.toCharArray()[j - i];
        }

        StringBuilder invertedInt = new StringBuilder();

        for (char i : invertedObject){
            invertedInt.append(i);
        }

        if(!valueObject.equalsIgnoreCase(invertedInt.toString())){
            return false;
        }

        return true;
    }
}
