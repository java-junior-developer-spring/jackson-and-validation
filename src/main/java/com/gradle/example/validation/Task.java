package com.gradle.example.validation;

import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.Range;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Task {

    @NotBlank(message = "Поле не может быть пустым")
    @Size(min = 5, max = 20, message = "От 5 до 20 символов")
    public String title;

    @NotBlank(message = "Поле не может быть пустым")
    @Size(min = 10, max = 300, message = "От 10 до 300 символов")
    private String description;

//    @Min(0)
//    @Max(5)
    @NotNull
    @Range(min = 0, max = 5)
    private int difficultyLevel; // [0;5]

    @NotNull
    @Future
    private LocalDateTime deadline; // in future

    private List<String> members = new ArrayList<>();

    public void addMember(@NotEmpty(message = "Участник дб передан") String member) {
        members.add(member);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers( List<String> members) {
        this.members = members;
    }
}