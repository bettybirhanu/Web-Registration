package com.registration;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistrationController {

	@Autowired
	private RegistrationService registrationService;

	@RequestMapping("/registration")
	public String renderForm(Model model) {
		model.addAttribute("registration", new Registration());
		return "registration";

	}

	@RequestMapping(value="/doRegistration", method = RequestMethod.POST)
	public String createRegistration(@ModelAttribute("registration") @Valid Registration registration,
			BindingResult result) {
		if (result.hasErrors()) {
            return "registration";
        }
		registrationService.createRegistration(registration);
      
        return "success";
	}
}
