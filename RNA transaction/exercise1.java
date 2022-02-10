class RnaTranscription {
    String transcribe(String dnaStrand) {
        char[] dna = dnaStrand.toCharArray();
        StringBuilder res = new StringBuilder();
        for (char c : dna){
            switch (c){
                case 'A':
                    res.append("U");
                    break;
                case 'C':
                    res.append("G");
                    break;
                case 'G':
                    res.append("C");
                    break;
                case 'T':
                    res.append("A");
                    break;
            }
        }
        return res.toString();
    }
}
