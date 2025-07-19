class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> l=new ArrayList<>();
        for(String i:folder){
            if(l.isEmpty()){
                l.add(i);
            }
            else{
                String prev=l.get(l.size()-1);
                if(i.startsWith(prev) && i.length()>prev.length() && i.charAt(prev.length())=='/'){
                    continue;
                }
                else{
                    l.add(i);
                }
            }
        }
        return l;
    }
}