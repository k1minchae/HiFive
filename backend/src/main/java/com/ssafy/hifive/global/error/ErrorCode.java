package com.ssafy.hifive.global.error;

import static org.springframework.http.HttpStatus.*;

import org.springframework.http.HttpStatus;

import lombok.Getter;

@Getter
public enum ErrorCode {
	/**
	 * default
	 */
	SYSTEM_ERROR(INTERNAL_SERVER_ERROR, "SYSTEM-000", "서비스에 장애가 발생했습니다."),
	BAD_REQUEST_ERROR(BAD_REQUEST, "SYSTEM-001", "유효하지 않은 요청입니다."),

	/**
	 * Member
	 */
	MEMBER_FORBIDDEN_ERROR(FORBIDDEN, "MEMBER-000", "사용자의 접근 권한이 없습니다."),
	MEMBER_NOT_FOUND(UNAUTHORIZED, "MEMBER-001", "사용자가 존재하지 않습니다."),
	NICKNAME_LENGTH(BAD_REQUEST, "CREATOR-002", "닉네임은 최소 2글자에서 최대 10글자 이내여야 합니다."),
	NICKNAME_SPECIAL_SYMBOL(BAD_REQUEST, "CREATOR-003", "닉네임에 특수문자를 포함할 수 없습니다."),
	NICKNAME_DUPLICATE(BAD_REQUEST, "CREATOR-004", "중복되는 닉네임이 존재합니다."),

	/**
	 * Board
	 */
	BOARD_NOT_FOUND(BAD_REQUEST, "BOARD-001", "boardId에 해당하는 Board가 존재하지 않습니다."),
	BOARD_DELETE_NOT_ALLOWED(FORBIDDEN, "BOARD-002", "자신이 작성하지 않은 게시글을 삭제할 수 없습니다."),

	/**
	 * Creator
	 */
	CREATOR_NOT_FOUND(BAD_REQUEST, "CREATOR-001", "creatorId에 해당하는 Creator가 존재하지 않습니다."),

	/**
	 * Auth
	 */
	INVALID_REFRESH_TOKEN(UNAUTHORIZED, "TOKEN-001", "유효하지 않은 리프레시 토큰입니다."),
	REFRESH_TOKEN_NOT_FOUND(BAD_REQUEST, "TOKEN-002", "리프레시 토큰을 찾을 수 없습니다."),

	/**
	 * Fanmeeting
	 */
	FANMEETING_NOT_FOUND(BAD_REQUEST, "FANMEETING-001", "FanmeetingId에 해당하는 Fanmeeting이 존재하지 않습니다."),

	/**
	 * Question
	 */
	QUESTION_NOT_FOUND(BAD_REQUEST, "QUESTION-001", "QuestionId에 해당하는 Question이 존재하지 않습니다."),

	/**
	 * Quiz
	 */
	QUIZ_NOT_FOUND(BAD_REQUEST, "QUIZ-001", "QuizId에 해당하는 Quiz가 존재하지 않습니다."),

	/**
	 * Story
	 */
	STORY_NOT_FOUND(BAD_REQUEST, "STORY-001", "StoryId에 해당하는 Story가 존재하지 않습니다."),

	/**
	 * Comment
	 */
	COMMENT_NOT_FOUND(BAD_REQUEST, "COMMENT-001", "commentId에 해당하는 Comment가 존재하지 않습니다."),

	/**
	 * Reservation
	 */
	RESERVATION_NOT_FOUND(BAD_REQUEST, "RESERVATION-001", "reservationId에 해당하는 Reservation이 존재하지 않습니다."),
	WANT_FOR_MONEY(BAD_REQUEST, "RESERVATION-002", "결제할 돈이 부족합니다."),
	ALREADY_RESERVATION(FORBIDDEN, "RESERVATION-003", "한 사람 당 하나의 티켓만 구매 가능합니다."),
	TICKET_SOLD_OUT(BAD_REQUEST, "RESERVATION-004", "티켓이 매진되었습니다."),
	/**
	 * Category
	 */
	CATEGORY_NOT_FOUND(BAD_REQUEST, "CATEGORY-001", "categoryId에 해당하는 Category가 존재하지 않습니다."),

	/**
	 * Photo
	 */
	PHOTO_NOT_FOUND(BAD_REQUEST, "PHOTO-001", "해당하는 사진을 찾을 수 없습니다.");

	private final HttpStatus httpStatus;
	private final String code;
	private final String message;

	ErrorCode(final HttpStatus httpStatus, final String code, final String message) {
		this.httpStatus = httpStatus;
		this.code = code;
		this.message = message;
	}
}