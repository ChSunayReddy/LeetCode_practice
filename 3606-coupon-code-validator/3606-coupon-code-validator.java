class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        final List<String> BUSINESS_LINE_ORDER = 
        Arrays.asList("electronics", "grocery", "pharmacy", "restaurant");
        int n = code.length;
        List<Coupon> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            String c = code[i];
            String bl = businessLine[i];
            boolean ia = isActive[i];
            if(!c.isEmpty() && c.matches("[a-zA-Z0-9_ ]*") && ia && !bl.equals("invalid")){
                if(BUSINESS_LINE_ORDER.contains(bl)) ans.add(new Coupon(c,bl));
            }
        }
        ans.sort((a,b) -> {
            int id1 = BUSINESS_LINE_ORDER.indexOf(a.businessLine);
            int id2 = BUSINESS_LINE_ORDER.indexOf(b.businessLine);
            if(id1!=id2) return Integer.compare(id1,id2);
            else return a.code.compareTo(b.code);
        });
        return ans.stream().map(coupon -> coupon.code).collect(Collectors.toList());
    }
    private static class Coupon {
        String code;
        String businessLine;
        
        Coupon(String code, String businessLine) {
            this.code = code;
            this.businessLine = businessLine;
        }
    }
}