class Solution {
    public String sortVowels(String s) {
        int n=s.length();
        List<Character> l=new ArrayList<>();
        for(char c:s.toCharArray()){
            if(isvowel(c)){
                l.add(c);
            }
        }
        Collections.sort(l);
        int i=0;
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(isvowel(c)){
                sb.append(l.get(i++));
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
    boolean isvowel(char c){
        return c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u'|| c=='A'|| c=='E'|| c=='I'|| c=='O'|| c=='U'; 
    }
}