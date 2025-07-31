import type {TurboModule} from 'react-native';
import {TurboModuleRegistry} from 'react-native';

export interface Spec extends TurboModule {
    readLocalizationFile(
        fileName: string,
        langCode: string | null,
        countryCode: string | null,
    ): string | null;
}

export default TurboModuleRegistry.getEnforcing<Spec>('FbteeModule');

