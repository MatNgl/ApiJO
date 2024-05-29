
public class Ticket {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int quantity;
    private double price;
    private boolean isDiscounted;

    @ManyToOne
    private User user;

    @ManyToOne
    private Event event;

    // Getters and Setters
}