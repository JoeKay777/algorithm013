package wk02;

public class Exercise1 {
	public String removeOuterParentheses(String S) {
		StringBuilder sb = new StringBuilder();
		int count = 0;
		for (char c : S.toCharArray()) {
			if(c == '(' && count++ > 0) {
				sb.append(c);
			}else if(c == ')' && --count > 0) {
				sb.append(c);
			}
		}
		
        return sb.toString();
    }
}
