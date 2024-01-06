package Candidate;

import java.util.ArrayList;

public class Election {
    private ArrayList<Candidate> candidateArrayList = new ArrayList<>();

    public int TotalVotes(){
        int totalVotes = 0;
        for (Candidate candidate : candidateArrayList){
            totalVotes += candidate.getNumberOfVotes();
        }
        return totalVotes;
    }

    public  void  tilføj(Candidate candidate){
        candidateArrayList.add(candidate);
    }
    public ArrayList<Candidate> getCandidateFromParty(String party){
        ArrayList<Candidate> candidateArrayListFromParty = new ArrayList<>();
        for (Candidate candidate : candidateArrayList){
            if (candidate.getParty().toLowerCase().equals(party.toLowerCase())){
                candidateArrayListFromParty.add(candidate);
            }
        }
        return candidateArrayListFromParty;
    }
}
