//Create an Online Voting System using a ConcurrentMap where:
//Each candidate's name is stored as a key in the ConcurrentMap, and their vote count is the value.
//For example:
//ConcurrentMap<String, Integer> votes = new ConcurrentHashMap<>();
//Multiple threads simulate voters casting their votes for candidates concurrently.
//The program should handle:
//Adding a new candidate to the map if not already present.
//Incrementing the vote count for an existing candidate safely.
//At the end of voting, display the final vote counts for all candidates.

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OnlineVotingSystem {

    public static void main(String[] args) {
        ConcurrentMap<String, Integer> votes = new ConcurrentHashMap<>();
        ExecutorService executor = Executors.newFixedThreadPool(4);
        executor.execute(() -> castVote(votes, "Alice"));
        executor.execute(() -> castVote(votes, "Bob"));
        executor.execute(() -> castVote(votes, "Alice"));
        executor.execute(() -> castVote(votes, "Charlie"));
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Final Vote Counts:");
        votes.forEach((candidate, count) -> System.out.println(candidate + ": " + count));
    }
    private static void castVote(ConcurrentMap<String, Integer> votes, String candidate) {
        votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
    }
}