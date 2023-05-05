package com.nereek.ninjagoldgame;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@SpringBootApplication
@Controller
public class NinjaGoldGameApplication {

	public static void main(String[] args) {
		SpringApplication.run(NinjaGoldGameApplication.class, args);
	}

	@RequestMapping("/")
	public String index(HttpSession session,Model model) {
		String actions = (String) session.getAttribute("actions");
		String action = "";
		String color = "text-success";

		if (session.getAttribute("prisontime") == null) {
			session.setAttribute("prisontime", 0);
		}
		if (session.getAttribute("prison") == null) {
			session.setAttribute("prison", 0);
		}
		long currentTimeSeconds = new Date().getTime() / 1000L;
		System.out.println(currentTimeSeconds);

		int currentTime = (int) currentTimeSeconds;
		System.out.println(currentTime);

		long prisonTime = (long) session.getAttribute("prisontime");
		System.out.println(prisonTime);
		// invert the sign to get positive value
		long timeInPrisonSeconds = currentTime - prisonTime;
		model.addAttribute("timeInPrisonSeconds", timeInPrisonSeconds);

		if ((int) session.getAttribute("prison") == 1 && timeInPrisonSeconds > 60) {
			session.setAttribute("prison", 0);
			action = "<p class='" + color + "'>You went out of prison and started with 0 Gold" + new Date() + "</p>";
			session.setAttribute("actions", actions + action);
			session.setAttribute("gold", 0);
		}
		return "index.jsp";
	}

	@RequestMapping("/action")
	public String action(@RequestParam(value = "quest") int quest, HttpSession session) {

		if (session.getAttribute("gold") == null) {
			session.setAttribute("gold", 0);
		}
		if (session.getAttribute("actions") == null) {
			session.setAttribute("actions", "");
		}
		if (session.getAttribute("prison") == null) {
			session.setAttribute("prison", 0);
		}
		if (session.getAttribute("prisontime") == null) {
			session.setAttribute("prisontime", 0);
		}
		int gold = (int) session.getAttribute("gold");
		int t = 0;
		String actions = (String) session.getAttribute("actions");
		String action = "";
		String color = "text-success";
		int rand = 0 - (int) new Date().getTime();

		if (quest == 10) {
			session.removeAttribute("actions");
			session.removeAttribute("gold");
			session.removeAttribute("prison");
			return "redirect:/";
		} else if (quest == 1) {
			t = rand % 11 + 10;
			action = "<p class='" + color + "'>You enterd a farm and earneds " + t + " gold(" + new Date() + ")</p>";

		} else if (quest == 2) {
			t = rand % 6 + 5;
			action = "<p class='" + color + "'>You enterd a cave and earneds " + t + " gold(" + new Date() + ")</p>";

		} else if (quest == 3) {
			t = rand % 6 + 2;
			action = "<p class='" + color + "'>You enterd a house and earneds " + t + " gold(" + new Date() + ")</p>";

		} else if (quest == 4) {
			t = rand % 101 - 50;
			action = "<p class='" + color + "'>You completed a quest and earneds " + t + " gold(" + new Date()
					+ ")</p>";

			if (t < 0) {
				color = "text-danger";
				action = "<p class='" + color + "'>You failed a quest and lost " + t + " gold, Ouch!(" + new Date()
						+ ")</p>";
			}
		} else if (quest == 5) {
			t = rand % 5 - 25;
			color = "text-danger";
			action = "<p class='" + color + "'>You went to a spa and lost " + t + " gold, Ouch!(" + new Date()
					+ ")</p>";
		}

		gold += t;
		session.setAttribute("actions", actions + action);

		session.setAttribute("gold", gold);

		if (gold < -50 && (int) session.getAttribute("prison") == 0) {
			color = "text-secondery";
			action = "<p class='" + color + "'>you have a lot of debt and went to prison (" + new Date() + ")</p>";
			long time = (long) new Date().getTime() / 1000L;
			session.setAttribute("prisontime", time);
			session.setAttribute("prison", 1);
			session.setAttribute("actions", actions + action);
			System.out.println(session.getAttribute("prisontime"));
		}

		return "redirect:/";
	}
}
