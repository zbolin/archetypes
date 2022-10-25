package com.zbolin.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zbolin.model.${model};

@Controller
public class ${controller}Controller {

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String ${controllerLower}(Locale locale, Model model) {
		System.out.println("${controller} Page Requested, locale = " + locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "${controllerLower}";
	}

	@RequestMapping(value = "/${modelLower}", method = RequestMethod.POST)
	public String ${modelLower}user(@Validated ${model} ${modelLower}, Model model) {
		System.out.println("${model} Page Requested");
		model.addAttribute("${attribLower}", ${modelLower}.get${attrib}());
		return "${modelLower}";
	}
}
