package section1_3.OOP.Encapsulation;

import java.time.LocalDate;

public final class UserProfile {
    private final String username;
    private final String email;
    private final LocalDate dateOfBirth;

    private UserProfile(Builder builder) {
        this.username = builder.username;
        this.email = builder.email;
        this.dateOfBirth = builder.dateOfBirth;
    }

    // Chỉ cung cấp getter, không có setter => immutable
    public String getUsername() { return username; }
    public String getEmail() { return email; }
    public LocalDate getDateOfBirth() { return dateOfBirth; }

    // Builder với validation
    public static class Builder {
        private String username;
        private String email;
        private LocalDate dateOfBirth;

        public Builder username(String username) {
            if (username == null || username.isBlank())
                throw new IllegalArgumentException("Username cannot be blank");
            this.username = username;
            return this;
        }

        public Builder email(String email) {
            if (!email.matches("^[\\w-.]+@[\\w-]+\\.[a-z]{2,}$"))
                throw new IllegalArgumentException("Invalid email format");
            this.email = email;
            return this;
        }

        public Builder dateOfBirth(LocalDate dateOfBirth) {
            if (dateOfBirth.isAfter(LocalDate.now()))
                throw new IllegalArgumentException("Date of birth cannot be in the future");
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public UserProfile build() {
            return new UserProfile(this);
        }
    }
}

