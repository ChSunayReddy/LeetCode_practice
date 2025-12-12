class Solution {
    public int[] countMentions(int nu, List<List<String>> events) {
        Collections.sort(events, (a,b)-> {
            int x = Integer.parseInt(a.get(1));
            int y = Integer.parseInt(b.get(1));
            int m1 = a.get(0).equals("OFFLINE") ? 0 : 1;
            int m2 = b.get(0).equals("OFFLINE") ? 0 : 1;
            return x==y ? m1-m2 : x-y; }
        );
        int[] ans = new int[nu];
        int[] online = new int[nu];
        for(List<String> i: events){
            String type = i.get(0);
            if(type.equals("MESSAGE")){
                int time = Integer.parseInt(i.get(1));
                String mention = i.get(2);
                if(mention.equals("ALL")){
                    for(int j=0;j<nu;j++) ans[j]++;
                }
                else if(mention.equals("HERE")){
                    for(int j=0;j<nu;j++){
                        if(time>=online[j]) ans[j]++;
                    }
                }
                else{
                    String[] arr = mention.split(" ");
                    for(String s:arr){
                        int x = Integer.parseInt(s.substring(2,s.length()));
                        ans[x]++;
                    }
                }
            }
            else{
                int id = Integer.parseInt(i.get(2));
                int time = Integer.parseInt(i.get(1));
                online[id] = time+60;
            }
        }
        return ans;
    }
}