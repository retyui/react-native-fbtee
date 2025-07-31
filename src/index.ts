import NativeFbteeModule from "./NativeFbteeModule";

export const Fbtee = {
  readLocalizationFile(
    fileName: string,
    langCode: string | null = null,
    countryCode: string | null = null,
  ): string | null {
    return NativeFbteeModule.readLocalizationFile(
      fileName,
      langCode,
      countryCode,
    );
  },
} as const;
