package Q16_18_Pattern_Matcher;

public class QuestionPatternMatcherAlik {
//	Not tested:
//	boolean isMatch(String value, String pattern, String mainString, String altString) {
//		if (pattern.isEmpty()) {
//			return value.isEmpty();
//		}
//		if (value.isEmpty()) return false;
//
//		char subChar = pattern.getCharAt(0);
//		if (subChar == ‘b’) {
//			String tmp = mainString;
//			mainString = altString;
//			altString = tmp;
//		}
//
//		if (mainString != null) {
//			int i = value.indexOf(mainString);
//			if (value.length < mainString.length || !value.SubString(i, mainString.length).equals(mainString)) { //
//				return false;
//			}
//			return isMatch(value.subString(a.length()),
//					pattern.subString(1),
//					subChar == ‘a’ ? mainString : altString,
//			subChar == ‘b’ ? mainString : altString);
//		}
//
//		for (int i = 1 ; i < value.length ; ++i) {
//			mainString = value.subString(0, i);
//			boolean isMatch = isMatch(value.subString(i),
//					pattern.subString(1),
//					subChar == ‘a’ ? mainString : altString,
//			subChar == ‘b’ ? mainString : altString);
//			if (isMatch) return true;
//		}
//		return false;
//	}

}
