package lomayd.DBMSLabSharding.api.domain.user.controller;

import lomayd.DBMSLabSharding.api.domain.user.dto.UserRequestDto;
import lomayd.DBMSLabSharding.api.domain.user.dto.UserResponseDto;
import lomayd.DBMSLabSharding.api.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    @Transactional
    public ResponseEntity<Void> joinUser(@RequestBody UserRequestDto.UserJoin userJoin) {
        userService.joinUser(userJoin);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<UserResponseDto.UserInfo> getUser(@RequestParam String id) {
        return ResponseEntity.ok(userService.getUser(id));
    }

    @PatchMapping
    @Transactional
    public ResponseEntity<Void> modifyUser(@RequestParam String id, @RequestBody UserRequestDto.UserModify userModify) {
        userService.modifyUser(id, userModify);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    @Transactional
    public ResponseEntity<Void> removeUser(@RequestParam String id) {
        userService.removeUser(id);
        return ResponseEntity.ok().build();
    }
}
