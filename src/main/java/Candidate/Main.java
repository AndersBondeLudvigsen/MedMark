package Candidate;

public class Main {
    public static void main(String[] args) {
        Candidate candidate1 = new Candidate("Anders", "SF", 2000);
        Candidate candidate2 = new Candidate("Anders2", "SF", 1000);
        Candidate candidate3 = new Candidate("Anders3", "SF", 3000);
        Candidate candidate4 = new Candidate("Anders4", "DG", 500);
        Candidate candidate5 = new Candidate("Anders5", "DF", 1000);
        Election election = new Election();
        election.tilføj(candidate1);
        election.tilføj(candidate2);
        election.tilføj(candidate3);
        election.tilføj(candidate4);
        election.tilføj(candidate5);
        System.out.println(election.TotalVotes());
        System.out.println(election.getCandidateFromParty("sf"));
    }
}
