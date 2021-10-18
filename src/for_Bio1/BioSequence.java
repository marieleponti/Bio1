package for_Bio1;

public class BioSequence {

    seqType type;
    String sequence;

    public seqType getType(){
        return this.type;
    }

    public String getSequence(){
        return this.sequence;
    }

    public void setType(seqType newType){
        this.type = newType;
    }

    public void setSequence(String newSeq){
        this.sequence = newSeq;
    }
}
