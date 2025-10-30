import java.util.*;

public class MetroPlanner {
    static Map<String, List<String>> metroMap = new HashMap<>();

    public static void main(String[] args) {
        buildMetroMap();
        Scanner sc = new Scanner(System.in);
        System.out.println("🚇 Chennai Metro Route Planner");
        System.out.print("Enter source station: ");
        String source = sc.nextLine().trim();
        System.out.print("Enter destination station: ");
        String destination = sc.nextLine().trim();

        List<String> route = findRoute(source, destination);
        if (route == null) {
            System.out.println("❌ No route found between " + source + " and " + destination);
        } else {
            System.out.println("\n✅ Route found:");
            for (String station : route) {
                System.out.print(station + " → ");
            }
            System.out.println("🏁");
            System.out.println("Total stops: " + (route.size() - 1));
        }
    }
    static void buildMetroMap() {
        metroMap.put("Washermanpet", Arrays.asList("Mannadi"));
        metroMap.put("Mannadi", Arrays.asList("Washermanpet", "High Court"));
        metroMap.put("High Court", Arrays.asList("Mannadi", "Central"));
        metroMap.put("Central", Arrays.asList("High Court", "Egmore"));
        metroMap.put("Egmore", Arrays.asList("Central", "Kilpauk"));
        metroMap.put("Kilpauk", Arrays.asList("Egmore", "Nehru Park"));
        metroMap.put("Nehru Park", Arrays.asList("Kilpauk", "Shenoy Nagar"));
        metroMap.put("Shenoy Nagar", Arrays.asList("Nehru Park", "Anna Nagar"));
        metroMap.put("Anna Nagar", Arrays.asList("Shenoy Nagar", "Thirumangalam"));
        metroMap.put("Thirumangalam", Arrays.asList("Anna Nagar", "Koyambedu"));
        metroMap.put("Koyambedu", Arrays.asList("Thirumangalam", "CMBT"));
        metroMap.put("CMBT", Arrays.asList("Koyambedu", "Ashok Nagar"));
        metroMap.put("Ashok Nagar", Arrays.asList("CMBT", "Vadapalani"));
        metroMap.put("Vadapalani", Arrays.asList("Ashok Nagar", "Arumbakkam"));
        metroMap.put("Arumbakkam", Arrays.asList("Vadapalani", "Shanthi Colony"));
        metroMap.put("Shanthi Colony", Arrays.asList("Arumbakkam"));
    }
    static List<String> findRoute(String source, String destination) {
        if (!metroMap.containsKey(source) || !metroMap.containsKey(destination)) return null;

        Queue<List<String>> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.add(Arrays.asList(source));
        while (!queue.isEmpty()) {
            List<String> path = queue.poll();
            String last = path.get(path.size() - 1);
            if (last.equals(destination)) return path;
            if (visited.contains(last)) continue;
            visited.add(last);
            for (String neighbor : metroMap.getOrDefault(last, new ArrayList<>())) {
                List<String> newPath = new ArrayList<>(path);
                newPath.add(neighbor);
                queue.add(newPath);
            }
        }
        return null;
    }
}
